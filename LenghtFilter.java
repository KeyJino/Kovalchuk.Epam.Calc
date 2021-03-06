import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

class LengthFilter extends DocumentFilter
{
    private int currentLength;
    private int maxLength;
    public LengthFilter(int currentLength, int maxLength)
    {
        this.currentLength = currentLength;
        this.maxLength = maxLength;
    }
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException
    {
        currentLength -= length;
        fb.remove(offset, length);
    }
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException
    {
        if((currentLength + string.length()) <= maxLength)
        {
            currentLength += string.length();
            fb.insertString(offset, string, attr);
        }
    }
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException
    {
        if((currentLength - length + string.length()) <= maxLength)
        {
            currentLength += string.length() - length;
            fb.replace(offset, length, string, attr);
        }
    }
}