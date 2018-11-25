public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        char [] charWord = word.toCharArray();
        int len = word.length();
        int max = 1;
        for(int i= 0; i<len ; i++){
            if(h[charWord[i]-97] > max)
                max = h[charWord[i]-97];
        }
        return max*len;
    }
}
