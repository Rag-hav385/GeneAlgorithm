
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    
    public String FindGene(String dna){
        String result = "";
        int startindex = dna.indexOf("ATG");
        if (startindex == -1){
            return "No Gene";
        }
        int Endindex = dna.indexOf("TAA" , startindex + 3);
        if (Endindex == -1){
            return "No Gene";
        }
        result = dna.substring(startindex , Endindex + 3);
        
        return result;
        
    }
    
    
    public void TestGeneAlgorithm(){
        String dna1 = "ATATGTATGTATGTGTATGGTAGTAA";
        String Gene1 = FindGene(dna1);
        System.out.println("Gene1 : " + Gene1);
        
        String dna2 = "ATTAATGTAGTGTGTGTTAAGT";
        String Gene2 = FindGene(dna2);
        System.out.println("Gene2 : " + Gene2);
        
        String dna3 = "ATATGTATGTATGTGTATGGTAGTAAGTETGFERTYHJHGD";
        String Gene3 = FindGene(dna3);
        System.out.println("Gene3 : " + Gene3);
        
    }
    

}
