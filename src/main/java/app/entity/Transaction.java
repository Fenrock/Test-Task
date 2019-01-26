package app.entity;

import java.util.List;

public class Transaction
{
    private List<Document> data;

    public List<Document> getData()
    {
        return data;
    }

    public void setData(List<Document> data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "Transaction{" +
                "data=" + data +
                '}';
    }
}
