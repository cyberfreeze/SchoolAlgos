import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println(convert(reader.nextLine()));
    }
    public static String convert(String input){
        input = input.replaceAll("AAA","a").replaceAll("AAC","b").replaceAll("AAG","c").replaceAll("AAT","d");
        input = input.replaceAll("ACA","e").replaceAll("ACC","f").replaceAll("ACG","g").replaceAll("ACT","h");
        input = input.replaceAll("AGA","i").replaceAll("AGC","j").replaceAll("AGG","k").replaceAll("AGT","l");
        input = input.replaceAll("ATA","m").replaceAll("ATC","n").replaceAll("ATG","o").replaceAll("ATT","p");
        input = input.replaceAll("CAA","q").replaceAll("CAC","r").replaceAll("CAG","s").replaceAll("CAT","t");
        input = input.replaceAll("CCA","u").replaceAll("CCC","v").replaceAll("CCG","w").replaceAll("CCT","x");
        input = input.replaceAll("CGA","y").replaceAll("CGC","z").replaceAll("CGG","A").replaceAll("CGT","B");
        input = input.replaceAll("CTA","C").replaceAll("CTC","D").replaceAll("CTG","E").replaceAll("CTT","F");
        input = input.replaceAll("GAA","G").replaceAll("GAC","H").replaceAll("GAG","I").replaceAll("GAT","J");
        input = input.replaceAll("GCA","K").replaceAll("GCC","L").replaceAll("GCG","M").replaceAll("GCT","N");
        input = input.replaceAll("GGA","O").replaceAll("GGC","P").replaceAll("GGG","Q").replaceAll("GGT","R");
        input = input.replaceAll("GTA","S").replaceAll("GTC","T").replaceAll("GTT","V").replaceAll("TAA","W");
        input = input.replaceAll("TAC","X").replaceAll("TAG","Y").replaceAll("TAT","Z").replaceAll("TCA","1");
        input = input.replaceAll("TCC","2").replaceAll("TCG","3").replaceAll("TCT","4").replaceAll("TGA","5");
        input = input.replaceAll("TGC","6").replaceAll("TGG","7").replaceAll("TGT","8").replaceAll("TTA","9");
        return input.replaceAll("TTC","0").replaceAll("TTG"," ").replaceAll("TTT",".");
    }
}

// a dumb method to translate dna into english
