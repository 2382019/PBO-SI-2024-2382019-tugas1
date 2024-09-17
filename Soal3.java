public class Soal3 {
    public static void main(String[] args) {
        String camelCaseString = "saveChangesInTheEditor";
        int count = 1;
        int i = 0;
        while (i < camelCaseString.length()){
            if (Character.isUpperCase(camelCaseString.charAt(i))) {
                count++;
            }
            i++;
        }
        System.out.println("Jumlah kata dalam camelCase: "+ count);
    }
}
