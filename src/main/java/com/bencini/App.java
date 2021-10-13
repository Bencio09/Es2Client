package com.bencini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClientStr cliente = new ClientStr();
        MultiClient multiClient = new MultiClient(Socket socket);
        cliente.connetti();
        cliente.comunica();


        
    }
}
