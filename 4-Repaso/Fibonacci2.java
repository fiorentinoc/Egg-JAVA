public class Fibonacci2 {
    
        public static void main(String args[]) {
            
            //Salida esperada: 0 1 1 2 3 5 8 13 21 34 -- 10 primeros nros. de la secuencia 
            
            int n1 = 0;
            int n2 = 1;
            
            System.out.println(n1);
            System.out.println(n2);
            
            for (int i = 0; i < 6; i++) {
                int n3 = n2 + n1; 
                System.out.println(n3);
                
                n1 = n2;
                n2 = n3; 
            }
            
        }
    }
