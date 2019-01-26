package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document
{
    private String hash;

    private String format;

    private String url;

    private String title;

    private String documentOf;

    private String datePublished;

    private String documentType;

    private String dateModified;

    private String relatedItem;

    @Id
    private String id;

    public String getHash()
    {
        return hash;
    }

    public void setHash(String hash)
    {
        this.hash = hash;
    }

    public String getFormat()
    {
        return format;
    }

    public void setFormat(String format)
    {
        this.format = format;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDocumentOf()
    {
        return documentOf;
    }

    public void setDocumentOf(String documentOf)
    {
        this.documentOf = documentOf;
    }

    public String getDatePublished()
    {
        return datePublished;
    }

    public void setDatePublished(String datePublished)
    {
        this.datePublished = datePublished;
    }

    public String getDocumentType()
    {
        return documentType;
    }

    public void setDocumentType(String documentType)
    {
        this.documentType = documentType;
    }

    public String getDateModified()
    {
        return dateModified;
    }

    public void setDateModified(String dateModified)
    {
        this.dateModified = dateModified;
    }

    public String getRelatedItem()
    {
        return relatedItem;
    }

    public void setRelatedItem(String relatedItem)
    {
        this.relatedItem = relatedItem;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Document{" +
                "hash='" + hash + '\'' +
                ", format='" + format + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", documentOf='" + documentOf + '\'' +
                ", datePublished='" + datePublished + '\'' +
                ", documentType='" + documentType + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", relatedItem='" + relatedItem + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
