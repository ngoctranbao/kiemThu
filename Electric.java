public class Electric {
    public static int electricBill(String type, int electricNumber) {
        if ( electricNumber < 0 || electricNumber > 5000) {
            return -1;
        }
        if ( type == "CN") {
            return electricNumber*1700;
        }
        if (type == "GD") {
            if (electricNumber < 50) 
                return electricNumber*50;
            if ( electricNumber < 150) 
                return ((electricNumber - 50)*1900 + 90000);
            return (electricNumber - 150)*2300 + 280000;
        }
        return -1;
    }
}
