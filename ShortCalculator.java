public class ShortCalculator {
    public String unsignedShortAdd(int a, int b){
        if (a < 0 || b < 0 || a > 65535 || b > 65535){
            return "Input out of range: 0-65535";
        } else {
            short addendA = (short)(a - 32768);
            short addendB = (short)(b - 32768);
            
            if((addendA + addendB + 65536) > 65536*2){
                return "Overflowed";
            } else {
                return "Whatever the addition would have been with unsigned shorts"; 
                /*What I was trying to do can't be done.
                I tried to store unsigned shorts inside of java's
                signed shorts. I can fit the data in, the issue is that
                java doesn't know that's what I'm trying to do and will
                still overflow integers at 2^16/2-1 instead of 2^16-1.
                The way around this would be to use an int to hold the
                information instead but we are not supposed to convert
                the information held in the short variable to int. The
                same goes for the other three methods. The only way around
                this is to limit the user input to less than 0-65535 but
                that was a design constraint. Given the restrictions, I
                believe there isn't a way to do it.*/
            }
        }
    }
}
