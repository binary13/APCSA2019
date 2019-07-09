

public class Editor2 
{
   private String phrase;
   private int slice;

   public Editor2( String before, String after )
   {
       phrase = before + after;
       slice = before.length();
   }
   
   public Editor2( String _phrase, int _slice ) 
   {
       phrase = _phrase;
       slice = _slice;
   }

   public String getBefore() { return phrase.substring(0,slice); }
   public String getAfter() { return phrase.substring(slice); } 
   
   public Editor2 rightArrow() { return new Editor2( phrase, slice + 1 ); }
   public Editor2 leftArrow() { return new Editor2( "please", "implement" ); }
   public Editor2 delete() { return new Editor2( "please", "implement" ); }
   public Editor2 backspace() { return new Editor2( "please", "implement" ); }
   public Editor2 insertString(String c) { return new Editor2( "please", "implement" ); }
   public Editor2 homeKey() { return new Editor2( "please", "implement" ); }
   public Editor2 endKey() { return new Editor2( "please", "implement" ); }
   public String toString() { return "# to be implemented"; }
}
