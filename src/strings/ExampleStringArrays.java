package strings;

public class ExampleStringArrays {
    public static void main(String[] args) {
        String tongueTwister = "Tongue Twister";
        System.out.println("tongueTwister = " + tongueTwister.toCharArray());

        char[] array = tongueTwister.toCharArray();
        int longArray = array.length;
        for (int i=0; i<longArray; i++){
            System.out.println("The element in the position "+i+" is = "+array[i]);
        }

        System.out.println("\nTongue Twister = " + tongueTwister.split("e"));

        String[] array2 = tongueTwister.split("e");
        int l = array2.length;
        for (int j=0; j<l; j++){
            System.out.println(array2[j]);
        }

        String archive = "some.image.pdf";
        String[] archiveArr = archive.split("\\.");
        l = archiveArr.length;
        System.out.println("l = "+ l);
        for (int j=0; j<l; j++){
            System.out.println(archiveArr[j]);
        }
    }
}
