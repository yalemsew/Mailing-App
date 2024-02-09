package MailingSystem;

import java.util.List;

public class Senior extends Client{
    private int age;
    Senior(String name, List<Packages> packagesList,
           List<Mail> mailListing,int age) {
        super(name,packagesList,mailListing);
        this.age = age;
    }
    public double disCount(){
        return 0.9;
    }
    public int getAge(){
        return age;
    }
}





//    Mail fedEx=new FedEx();
//    Mail US = new USMail();
//    Mail USP = new USMail();
//    List<String> stringList=new ArrayList<>();
//    String str="";
//        for(Packages packages:packagesList){
//                double fedExPrice = fedEx.calculateCost(packages);
//                double usPrice = US.calculateCost(packages);
//                double uspPrice = USP.calculateCost(packages);
//                if(fedExPrice<=usPrice && fedExPrice<=uspPrice){
//                str=getName()+" "+fedExPrice*0.9+" FedEx";
//                }else if(usPrice<=fedExPrice && usPrice<=uspPrice){
//                str=getName()+" "+usPrice*0.9+" FedEx";
//                }else{
//                str=getName()+" "+usPrice*0.9+" FedEx";
//                }
//                stringList.add(str);
//                }
//                return stringList;
