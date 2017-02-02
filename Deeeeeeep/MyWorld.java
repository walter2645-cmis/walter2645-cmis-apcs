import greenfoot.*;  

public class MyWorld extends World
{
    private Node node, first, last;
    public MyWorld()
    {
        super(600, 400, 1); 

        node = new Node(null);
        first = node;
        addObject(node, 300, 200);
        for (int j = 1; j < 10; j++){
            node = new Node(node);
            addObject(node, 300, 200);
            last = node;
        }

    }

    public void act(){
        String key = Greenfoot.getKey();
        if (key != null){
            if ( key.equals("n")){
                addNode();
            }

            if ( key.equals("r")){
                removeNode();
            }
            
            if( key.equals("h"))
            {
                removeHead();
            }
        }
    }

    public int[] getNewLocation(){
        int[] location;
        if(getObjects(null).contains(first)){
            location = new int[]{first.getX(), first.getY()};
        }else{
            location = new int[]{Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight())};
        }
        return location;
    }

    public void addNode(){
        node = new Node(last);
        if(first == null){
            first = node;
        }
        int[] loc = getNewLocation();
        last = node;
        addObject(node, loc[0], loc[1]);
    }

    public void removeNode(){
        if ( last != null ){
            removeObject(last);
            last = last.getTarget();
            first = last == null ? null : first;
        }
    }

    public void removeHead()
    {
        if( first == last )
        {
            removeObject(first);
            last = null;
            first = null;
        }
        else if( first != null && last != null )
        {
            Node newHead = findNewHead(last);
            newHead.setTarget(null);
            removeObject(first);
            first = newHead;
        }
    }

    public Node findNewHead( Node head )
    {
        while( head.getTarget().getTarget() != null )
        {
            head = head.getTarget();
        }
        return head;
    }
}