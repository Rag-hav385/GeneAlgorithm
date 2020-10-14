
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String FindGene(String dna ,String startindex , String Endindex){
        String result = "";
        int startindex_no = dna.indexOf(startindex);
        if (startindex_no == -1){
            return "No Gene";
        }
        int Endindex_no = dna.indexOf(Endindex , startindex_no + 3);
        if (Endindex_no == -1){
            return "No Gene";
        }
        result = dna.substring(startindex_no , Endindex_no + 3);
        if (result.length() % 3 == 0){
        return result;
    }
    else{
        return "No Gene";
    }
    
    }
    
    
    public void TestGeneAlgorithm(){
        String dna1 = "AAATGCCCTAACTAGATTAAGAAACC";
        String Gene1 = FindGene(dna1 , "ATG" , "TAA");
        System.out.println("Gene1 : " + Gene1);
        
        String dna2 = "ATTAATGTAGTGTGTGTTAAGT";
        String Gene2 = FindGene(dna2, "ATG" , "TAA");
        System.out.println("Gene2 : " + Gene2);
        
        String dna3 = "ATATGTATGTATGTGTATGGTAGTAAGTETGFERTYHJHGD";
        String Gene3 = FindGene(dna3,"ATG" , "TAA");
        System.out.println("Gene3 : " + Gene3);
        
    }

}
