package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        int x = 42;
        int y = 15;
        System.out.println(~42); //~00101010 == 11010101
        System.out.println(~15); //~00001111 == 11110000
        System.out.println(42 & 15); //00101010 & 00001111 == 00001010
        System.out.println(x &= y); //00101010 ==  00101010 & 00001111 (x=00001010=10)
        System.out.println(42 | 15); //00101010 | 00001111 == 00101111
        System.out.println(x |= y); //00001010 ==  00001010 | 00001111 (x=00001111=15)
        System.out.println(42 ^ 15); //00101010 ^ 00001111 == 00100101
        System.out.println(x ^= y); // 00001111 == 00001111 ^ 00001111 (x=00000000)
        System.out.println(42 >> 15); // 00101010 >> 15 == 00000000
        System.out.println(x >>= y); // x = x >> y; 0 = 0>>15 (x=0)
        System.out.println(42 >>> 15); // 00101010 >>> 15 == 0
        System.out.println(42 << 15); // 00101010 << 15 == 00101010000000000000000
        System.out.println(x <<= y); // x = x << y; 0 = 0 << 15 (x=0)
        System.out.println(x >>>= y);// x = x>>>y; 0=0>>>15 (x=0)
        int z = -42;
        int v = -15;
        System.out.println(~-42); // ~11010110 == 00101001
        System.out.println(~-15); // ~11110001 == 00001110
        System.out.println(-42 & -15); // 11010110 & 11110001 == 11010000
        System.out.println(z &= v); // 11010110 == 11010110 & 11110001 (z=11010000=-48)
        System.out.println(-42 | -15); // 11010110 | 11110001 == 11110111
        System.out.println(z |= v); // 11010000 == 11010000 | 11110001 (z= 11110001=-15)
        System.out.println(-42 ^ -15); // 11010110 ^ 11110001 == 00100111
        System.out.println(z ^= v); // 1111001 == 11110001 ^ 11110001 (z = 0)
        System.out.println(-42 >> -15); // 11010110 >> -15 == 11111111
        System.out.println(z >>= v); // 0 == 0 >> 11110001 (z=0)
        System.out.println(-42 >>> -15); // 11010110 >>> -15 == 111111111111111
        System.out.println(-42 << -15); // 11010110 << -15 == -10101000000000000000000
        System.out.println(z <<= v); // 0 == 0 << -15 (z=0)
        System.out.println(z >>>= v); // 0 == 0 >>> -15 (z=0)

    }
}
