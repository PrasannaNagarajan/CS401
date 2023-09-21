package Lab7;

    public class SimpleAList
    {
        // Note the two encapsulated variables -- an array to store
        // the data and an int to keep track of the size.  These variables
        // are protected rather than private because they will be used
        // in a future handout.
        protected String [] data;
        protected int size;
        
        // Initialize with a specific capacity
        public SimpleAList(int init)
        {
            size = 0;
            data = new String[init];
        }
        
        // Default constructor. In this case, the user does not know
        // the capacity (which they do not need to know).
        public SimpleAList()
        {
            size = 0;
            data = new String[4];
        }
        
        // Add new item at the end of the array.  If there is no room
        // resize the array and then add the item.  Note that the add
        // always succeeds (unless the system runs out of memory, which
        // would cause a run-time error).
        public boolean add(String val)
        {
            if (size == data.length)
                resize(2 * size);
            data[size] = val;
            size++;
            return true;
        }
        
        // Add item into arbitrary index, shifting to make room.  Note
        // the overhead required to shift the data.
        public boolean add(int loc, String val)
        {
            if (loc >= 0 && loc <= size)
            {
                if (size == data.length)
                    resize(2 * size);
                // Loop to make a gap in the array for the new item
                for (int i = size; i > loc; i--)
                    data[i] = data[i-1];
                data[loc] = val;
                size++;
                return true;
            }
            return false;
        }
        
        // Remove item at stated index, shifting to fill in the gap.
        // Note that again we have overhead due to shifting.
        public String remove(int loc)
        {
            if (loc >= 0 && loc < size)
            {
                String old = data[loc];
                // Loop to fill the gap from the deleted item
                for (int i = loc; i < size-1; i++)
                    data[i] = data[i+1];
                data[size-1] = null;
                size--;
                return old;
            }
            return null;
        }
        
        // Return item at stated index.  This is very simple due to
        // direct access of an array.
        public String get(int loc)
        {
            if (loc >= 0 && loc < size)
                return data[loc];
            else
                return null;
        }
        
        // Assign new value to stated location in list, returning old
        // value.  This is again very simple due to direct access.
        public String set(int loc, String val)
        {
            if (loc >= 0 && loc < size)
            {
                String old = data[loc];
                data[loc] = val;
                return old;
            }
            return null;
        }		
    
        // Return logical size of list
        public int size()
        {
            return size;
        }
        
        // Resize list.  Note that this is protected and not public.  We do not want
        // the user to explicitly resize the list -- resizing is an implicit
        // activity that is done as necessary when adding to the list.  Thus, it
        // can be called from WITHIN the class (i.e. from the add() method)
        // but it CANNOT be called from outside the class (by the user).
        protected void resize(int newSize)
        {
            if (newSize > size)
            {
                String [] newA = new String[newSize];
                for (int i = 0; i < size; i++)
                    newA[i] = data[i];
                data = newA;
            }
        }

        public String toString(){ 
            StringBuilder s = new StringBuilder();

            if (size == 0 ){
                System.out.println("list is empty");
            }
            else{
            for (String strtemp : data){
                if (strtemp == null){
                    continue;
                }
                s.append(strtemp + " ");
            }
        }
            return s.toString();
        // Return a single String representation
        // of all of the data in the list, separated by spaces. If
        // the SimpleAList is empty (special case) return the String
        // "List is empty".
        }
        public boolean equals(SimpleAList arg){
            if (size ==  arg.size){
                for (int i = 0; i < size ;i ++){
                    if (data[i].equals(arg.get(i))){
                        
                    }
                    else{
                        return false;
                    }
                }
                return true;
            }
            else{
                return false;
            }
            }
        }
        // Return true if the data
        // in SimpleAList arg exactly matches the data in the current
        // SimpleAList. All Strings must match in the order stored.
        // Return false otherwise.

    
    
