public class StringOperations {

    public static void main(String[] args){
        // Create string obj. w/ value as my name
        String myName = "Brad Spencer";
        System.out.println(myName);

        // Replace first and last letters w/ A & Z
        String myName1 = 'A' + myName.substring(1,myName.length()-1) + 'Z';
        System.out.println(myName1);

        // Web address string
        String myURL = "www.gatech.edu";
        System.out.println(myURL);

        // Extract name portion of URL and append 1331
        int begin = myURL.indexOf('.')+1;
        int end = myURL.indexOf('.',begin+1);
        String myURLName = myURL.substring(begin, end) + "1331";
        System.out.println(myURLName);

    }
}
