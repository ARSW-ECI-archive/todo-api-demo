package com.eci.cosw.TodoRestAPI;

/**
 * @author Santiago Carrillo
 * 2/14/18.
 */
public class Todo
{

    private String name;

    private int priority;

    private boolean completed;


    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority( int priority )
    {
        this.priority = priority;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted( boolean completed )
    {
        this.completed = completed;
    }

    public Todo( String name, int priority )
    {
        this.name = name;
        this.priority = priority;
    }
}
