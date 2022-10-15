public class ReverseBits {
    public static void main(String[] args) {

        int tritzatDva = 5674554;
        System.out.println(ReverseBits(tritzatDva));
    }

    public static int ReverseBits(int og){

        int out = 0;
        for(int shift = 0; shift < 32; shift++){
            out = out | (((og >> shift) & 1) << 31 - shift); //
            System.out.println(Integer.toBinaryString(out));

        }
        System.out.println(Integer.toBinaryString(out));
        return out;
    }
}