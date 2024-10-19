public class GetProductosQuery implements Query {
    private int id;

    public GetProductosQuery(int id){
        this.id =  id;
    }

    public int getId(){
        return id;
    }
}
