package domain;

public class BItWise {

    String exec(int input) {
        /*
        *  Operation Bit Bit
        *  (89) 0101 1001 ----\     /----- &: 0001 0001 (24)
        *                  --------------  |: 0111 1101 (125)
        *  (60) 0011 1100 ----/     \----- ^: 0110 0101 (111)
        * */
         int mask = 0b100000;
         if((input & mask) != 0) {
             return ("THE 6TH BIT IS TRUE");
         }else {
             return ("THE 6TH BIT IS FALSE");
         }

    }
}
