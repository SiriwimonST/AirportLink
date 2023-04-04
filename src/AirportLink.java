public class AirportLink {
    public int distance;
    public String name;
    public int ppl;
    public double cash;
    public double peoplee;
    public double totalprice;
    public AirportLink() {
        
    }
    public void calculateFare(int distance){
        final double BASE_FARE = 15.0;
        this.distance=distance;
        this.cash = distance*BASE_FARE;
    }
    public void setPeoplee(Double peoplee){
        this.peoplee = peoplee;
    }
    public double getPeoplee(){
        return peoplee;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPpl(int ppl){
        this.ppl = ppl;
    }
    
    public int getPpl(){
        return ppl;
    }
    
    public void setCash(int cash){
        this.cash = cash;
    }
    
    public double getCash(){
        return cash;
    }
    public void setdistance(int distance){
        this.distance = distance;
    }
    
    public int getdistance(){
        return distance;
    }
    
    public double gettotalprice(){
        return this.totalprice;
    }
}
