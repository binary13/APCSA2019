

public class Editor1 
{
   private String pre;
   private String post;

   public Editor1( String before, String after )
   {
       pre = before;
       post = after;
   }
   
   public String getBefore() { return pre; }
   public String getAfter() { return post; } 
   public Editor1 rightArrow() { return new Editor1( pre + post.substring(0,1), post.substring(1)  ); }
   public Editor1 leftArrow() { return new Editor1( "please", "implement" ); }
   public Editor1 delete() { return new Editor1( "please", "implement" ); }
   public Editor1 backspace() { return new Editor1( "please", "implement" ); }
   public Editor1 insertString(String c) { return new Editor1( "please", "implement" ); }
   public Editor1 homeKey() { return new Editor1( "please", "implement" ); }
   public Editor1 endKey() { return new Editor1( "please", "implement" ); }
   public String toString() { return "# to be implemented"; }
}
