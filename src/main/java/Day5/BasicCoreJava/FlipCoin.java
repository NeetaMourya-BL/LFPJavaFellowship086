package Day5.BasicCoreJava;
import java.text.DecimalFormat;
public class FlipCoin {
public static void main(String[] args) {
	int head=0,tails=0;
	double tailPercent=0,headPercent=0;
	for (int i=0;i<50;i++) {
if(Math.random() < 0.5) {
	System.out.println("Tails");
	tails+=1;
    tailPercent=tails*100/50;
	}
else{
	System.out.println("Head");
    head+=1;
	headPercent=head*100/50;
    }
	}
	System.out.println("Head="+head);
    System.out.println("Tails="+tails);
	System.out.println("HeadPercent="+headPercent+"%");
	System.out.println("TailsPersent="+tailPercent+"%");
}
}