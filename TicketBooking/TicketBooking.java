/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketBooking;

/**
 *
 * @author Harsh007
 */
import java.util.Random;

public class TicketBooking {
    static Random rd= new Random();
    public static void main(String args[]){
        int Attendants=4;
        int bookingTime=4;
        int day=1440;
        int maxCustomerPerMin=6;
        int maxWaitingTime=0;
        int currentWaitingTime=0;
        int customers;
        int totalTime=0;

        int[] attendants = new int [Attendants];
        for (int i=0;i<Attendants;i++){
            attendants[i]=0;

        }
        Queue<Integer> queuec = new Queue<Integer>();
        int t=1;


          for ( t =1;t<day;t++){
            //   System.out.println(t);
              
            for(int i=0;i<attendants.length;i++){
                if(attendants[i]>0){
                    attendants[i]--;
               }
             }
             
          }

      

        for (int i=0;i<attendants.length && !(queuec.empty());i++){
            if (attendants[i]==0){
                int x= queuec.dequeue();
                attendants[i]+=x;
                currentWaitingTime-=x;
            }
           
        }
        System.out.println("Waiting time is : " + currentWaitingTime + " minutes");
        customers=rd.nextInt(maxCustomerPerMin);

        for (int j=0; j<customers;j++){
             int x=rd.nextInt(bookingTime);

            queuec.enqueue(x);
            currentWaitingTime+=x;
            totalTime+=currentWaitingTime;
             System.out.println("Waiting time is : " + currentWaitingTime + " minutes");
         }

        int avgWait=totalTime/customers;
        if (currentWaitingTime>maxWaitingTime){
            maxWaitingTime=currentWaitingTime;


        }
        System.out.println("The number of attendant is "+attendants.length );
        System.out.println("The number of customers in queue is "+customers);
        System.out.println("The average waiting time is "+avgWait+ " minutes");
        System.out.println("The maximum waiting time is "+maxWaitingTime + " minutes");

    }

    
}
 

