package com.example.yass;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class ClientServiceImplMockTest {

    @Autowired
    ClientService cl;
    @Mock
    ClientRepository clientRepository;
    @InjectMocks
    ClientServiceImp clientService;

    @Test
    @Order(1)
    public void testRetrieveAllClients() {
        List<Client> listClients = cl.list();
        Assertions.assertEquals(0, listClients.size());
    }

    Client client = new Client("n1", "a1", "j1");
    List<Client> listClients = new ArrayList<Client>() {
        {
            add(new Client("n2", "a2", "j2"));
            add(new Client("n3", "a3", "j3"));
        }
    };
    @Test
    @Order(2)
    public void testRetrieveClient() {
        //mockito
        Mockito.when(clientRepository.findById(Mockito.anyInt())).thenReturn(client);
        Client client1 = clientService.listId(2);
        Assertions.assertNotNull(client1);
    }

}