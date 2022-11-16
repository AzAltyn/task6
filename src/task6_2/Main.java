package task6_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Workers[] workers = new Workers[15];
        {
            workers[0] = new Staff(101, "Kaz", "ASM", 20000);
            workers[1] = new Staff(102, "Kaz", "ASM", 22000);
            workers[2] = new Staff(103, "Kaz", "ASM", 23000);
            workers[3] = new Staff(104, "Kaz", "ASM", 24000);
            workers[4] = new Staff(105, "Kaz", "ASM", 21000);

            workers[5] = new HRManagers(201, "MSO Kdmasd", 30000);
            workers[6] = new HRManagers(202, "MSO Kdmasd", 50000);
            workers[7] = new HRManagers(203, "MSO Kdmasd", 20000);
            workers[8] = new HRManagers(204, "MSO Kdmasd", 10000);
            workers[9] = new HRManagers(205, "MSO Kdmasd", 40000);

            workers[10] = new Programmers(301, "IMc mac", 10000, 3000, 0.8);
            workers[11] = new Programmers(302, "IMc mac", 20000, 2000, 0.8);
            workers[12] = new Programmers(303, "IMc mac", 50000, 3000, 0.8);
            workers[13] = new Programmers(304, "IMc mac", 30000, 3000, 0.8);
            workers[14] = new Programmers(305, "IMc mac", 35000, 3000, 0.8);
        }

        System.out.println("The highest salary");
        System.out.println("------------------");
        highSalary(workers);
        System.out.println("------------------");

        System.out.println("Workers, by salary, in descending order.");
        System.out.println("------------------");
        workersByOrder(workers);
        for (Workers workers1: workers){
            System.out.println(workers1.getWorkerData());
        }
        System.out.println("------------------");

    }
    public static void workersByOrder(Workers[] workers){
        Workers temp;
        for (int j = 0; j < workers.length - 1; j++)
        {
            for (int k = j + 1; k < workers.length; k++)
            {
                if (workers[j].getSalary() < workers[k].getSalary())
                {
                    temp = workers[k];
                    workers[k] = workers[j];
                    workers[j] = temp;
                }
            }
        }
    }
    public static void highSalary(Workers[] objects){
        int max = objects[0].getSalary();
        int z = 0;
        for (int i = 0; i< objects.length; i++){
            if (objects[i].getSalary()>max){
                max = objects[i].getSalary();
                z = i;
            }
        }
        System.out.println(objects[z].getWorkerData());
    }
}
