/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymouse;

/**
 *
 * @author 100018
 */
public class Anonymouse {

    interface HelloWorld {

        public void hello1();

        public void hello2();
    }

    public void getData() {
        class HellloEnglish implements HelloWorld {

            @Override
            public void hello1() {
                System.out.println("Show English 1");
            }

            @Override
            public void hello2() {
                System.out.println("Show English 1");

            }

        }
      
    }

}
