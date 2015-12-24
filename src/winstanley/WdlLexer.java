/* The following code was generated by JFlex 1.4.3 on 1/3/16 5:56 PM */

package winstanley;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import winstanley.psi.WdlTypes;
import com.intellij.psi.TokenType;

// Regenerate from IntelliJ using Flex plugin and COMMAND-SHIFT-G


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/3/16 5:56 PM from the specification file
 * <tt>/Users/chrisl/IdeaProjects/winstanley/src/winstanley/Wdl.flex</tt>
 */
class WdlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int COMMAND1 = 8;
  public static final int COMMAND2_VAR = 14;
  public static final int COMMAND1_VAR_D_QUOTE = 20;
  public static final int COMMAND1_VAR = 12;
  public static final int WAITING_TASK_IDENTIFIER_DECL = 4;
  public static final int COMMAND1_VAR_S_QUOTE = 22;
  public static final int YYINITIAL = 0;
  public static final int D_QUOTE = 16;
  public static final int COMMAND2_VAR_D_QUOTE = 24;
  public static final int WAITING_WORKFLOW_IDENTIFIER_DECL = 2;
  public static final int S_QUOTE = 18;
  public static final int COMMAND2_VAR_S_QUOTE = 26;
  public static final int WAITING_COMMAND = 6;
  public static final int COMMAND2 = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\4\1\0\1\17\1\16\22\0\1\17\1\53\1\1"+
    "\1\67\1\63\1\62\1\66\1\2\1\45\1\46\1\60\1\56\1\64"+
    "\1\57\1\54\1\61\1\15\1\15\1\15\1\15\1\15\1\15\1\15"+
    "\1\15\1\15\1\15\1\51\1\0\1\43\1\52\1\44\1\55\1\0"+
    "\1\20\1\30\3\76\1\34\2\76\1\33\3\76\1\22\1\76\1\24"+
    "\3\76\1\37\1\76\1\35\5\76\1\47\1\3\1\50\1\0\1\75"+
    "\1\0\1\12\1\25\1\27\1\74\1\10\1\11\1\40\1\73\1\36"+
    "\1\26\1\72\1\13\1\70\1\32\1\31\1\23\1\76\1\6\1\14"+
    "\1\5\1\7\1\76\1\71\1\76\1\21\1\76\1\41\1\65\1\42"+
    "\54\0\1\76\12\0\1\76\4\0\1\76\5\0\27\76\1\0\37\76"+
    "\1\0\u01ca\76\4\0\14\76\16\0\5\76\7\0\1\76\1\0\1\76"+
    "\201\0\5\76\1\0\2\76\2\0\4\76\10\0\1\76\1\0\3\76"+
    "\1\0\1\76\1\0\24\76\1\0\123\76\1\0\213\76\10\0\236\76"+
    "\11\0\46\76\2\0\1\76\7\0\47\76\110\0\33\76\5\0\3\76"+
    "\55\0\53\76\25\0\12\77\4\0\2\76\1\0\143\76\1\0\1\76"+
    "\17\0\2\76\7\0\2\76\12\77\3\76\2\0\1\76\20\0\1\76"+
    "\1\0\36\76\35\0\131\76\13\0\1\76\16\0\12\77\41\76\11\0"+
    "\2\76\4\0\1\76\5\0\26\76\4\0\1\76\11\0\1\76\3\0"+
    "\1\76\27\0\31\76\107\0\1\76\1\0\13\76\127\0\66\76\3\0"+
    "\1\76\22\0\1\76\7\0\12\76\4\0\12\77\1\0\7\76\1\0"+
    "\7\76\5\0\10\76\2\0\2\76\2\0\26\76\1\0\7\76\1\0"+
    "\1\76\3\0\4\76\3\0\1\76\20\0\1\76\15\0\2\76\1\0"+
    "\3\76\4\0\12\77\2\76\23\0\6\76\4\0\2\76\2\0\26\76"+
    "\1\0\7\76\1\0\2\76\1\0\2\76\1\0\2\76\37\0\4\76"+
    "\1\0\1\76\7\0\12\77\2\0\3\76\20\0\11\76\1\0\3\76"+
    "\1\0\26\76\1\0\7\76\1\0\2\76\1\0\5\76\3\0\1\76"+
    "\22\0\1\76\17\0\2\76\4\0\12\77\25\0\10\76\2\0\2\76"+
    "\2\0\26\76\1\0\7\76\1\0\2\76\1\0\5\76\3\0\1\76"+
    "\36\0\2\76\1\0\3\76\4\0\12\77\1\0\1\76\21\0\1\76"+
    "\1\0\6\76\3\0\3\76\1\0\4\76\3\0\2\76\1\0\1\76"+
    "\1\0\2\76\3\0\2\76\3\0\3\76\3\0\14\76\26\0\1\76"+
    "\25\0\12\77\25\0\10\76\1\0\3\76\1\0\27\76\1\0\12\76"+
    "\1\0\5\76\3\0\1\76\32\0\2\76\6\0\2\76\4\0\12\77"+
    "\25\0\10\76\1\0\3\76\1\0\27\76\1\0\12\76\1\0\5\76"+
    "\3\0\1\76\40\0\1\76\1\0\2\76\4\0\12\77\1\0\2\76"+
    "\22\0\10\76\1\0\3\76\1\0\51\76\2\0\1\76\20\0\1\76"+
    "\21\0\2\76\4\0\12\77\12\0\6\76\5\0\22\76\3\0\30\76"+
    "\1\0\11\76\1\0\1\76\2\0\7\76\72\0\60\76\1\0\2\76"+
    "\14\0\7\76\11\0\12\77\47\0\2\76\1\0\1\76\2\0\2\76"+
    "\1\0\1\76\2\0\1\76\6\0\4\76\1\0\7\76\1\0\3\76"+
    "\1\0\1\76\1\0\1\76\2\0\2\76\1\0\4\76\1\0\2\76"+
    "\11\0\1\76\2\0\5\76\1\0\1\76\11\0\12\77\2\0\4\76"+
    "\40\0\1\76\37\0\12\77\26\0\10\76\1\0\44\76\33\0\5\76"+
    "\163\0\53\76\24\0\1\76\12\77\6\0\6\76\4\0\4\76\3\0"+
    "\1\76\3\0\2\76\7\0\3\76\4\0\15\76\14\0\1\76\1\0"+
    "\12\77\6\0\46\76\1\0\1\76\5\0\1\76\2\0\53\76\1\0"+
    "\u014d\76\1\0\4\76\2\0\7\76\1\0\1\76\1\0\4\76\2\0"+
    "\51\76\1\0\4\76\2\0\41\76\1\0\4\76\2\0\7\76\1\0"+
    "\1\76\1\0\4\76\2\0\17\76\1\0\71\76\1\0\4\76\2\0"+
    "\103\76\45\0\20\76\20\0\125\76\14\0\u026c\76\2\0\21\76\1\0"+
    "\32\76\5\0\113\76\25\0\15\76\1\0\4\76\16\0\22\76\16\0"+
    "\22\76\16\0\15\76\1\0\3\76\17\0\64\76\43\0\1\76\4\0"+
    "\1\76\3\0\12\77\46\0\12\77\6\0\130\76\10\0\51\76\1\0"+
    "\1\76\5\0\106\76\12\0\35\76\51\0\12\77\36\76\2\0\5\76"+
    "\13\0\54\76\25\0\7\76\10\0\12\77\46\0\27\76\11\0\65\76"+
    "\53\0\12\77\6\0\12\77\15\0\1\76\135\0\57\76\21\0\7\76"+
    "\4\0\12\77\51\0\36\76\15\0\2\76\12\77\54\76\32\0\44\76"+
    "\34\0\12\77\3\0\3\76\12\77\44\76\153\0\4\76\1\0\4\76"+
    "\3\0\2\76\11\0\300\76\100\0\u0116\76\2\0\6\76\2\0\46\76"+
    "\2\0\6\76\2\0\10\76\1\0\1\76\1\0\1\76\1\0\1\76"+
    "\1\0\37\76\2\0\65\76\1\0\7\76\1\0\1\76\3\0\3\76"+
    "\1\0\7\76\3\0\4\76\2\0\6\76\4\0\15\76\5\0\3\76"+
    "\1\0\7\76\164\0\1\76\15\0\1\76\20\0\15\76\145\0\1\76"+
    "\4\0\1\76\2\0\12\76\1\0\1\76\3\0\5\76\6\0\1\76"+
    "\1\0\1\76\1\0\1\76\1\0\4\76\1\0\13\76\2\0\4\76"+
    "\5\0\5\76\4\0\1\76\64\0\2\76\u0a7b\0\57\76\1\0\57\76"+
    "\1\0\205\76\6\0\4\76\3\0\2\76\14\0\46\76\1\0\1\76"+
    "\5\0\1\76\2\0\70\76\7\0\1\76\20\0\27\76\11\0\7\76"+
    "\1\0\7\76\1\0\7\76\1\0\7\76\1\0\7\76\1\0\7\76"+
    "\1\0\7\76\1\0\7\76\120\0\1\76\u01d5\0\2\76\52\0\5\76"+
    "\5\0\2\76\4\0\126\76\6\0\3\76\1\0\132\76\1\0\4\76"+
    "\5\0\51\76\3\0\136\76\21\0\33\76\65\0\20\76\u0200\0\u19b6\76"+
    "\112\0\u51cd\76\63\0\u048d\76\103\0\56\76\2\0\u010d\76\3\0\20\76"+
    "\12\77\2\76\24\0\57\76\20\0\31\76\10\0\106\76\61\0\11\76"+
    "\2\0\147\76\2\0\4\76\1\0\4\76\14\0\13\76\115\0\12\76"+
    "\1\0\3\76\1\0\4\76\1\0\27\76\35\0\64\76\16\0\62\76"+
    "\34\0\12\77\30\0\6\76\3\0\1\76\4\0\12\77\34\76\12\0"+
    "\27\76\31\0\35\76\7\0\57\76\34\0\1\76\12\77\46\0\51\76"+
    "\27\0\3\76\1\0\10\76\4\0\12\77\6\0\27\76\3\0\1\76"+
    "\5\0\60\76\1\0\1\76\3\0\2\76\2\0\5\76\2\0\1\76"+
    "\1\0\1\76\30\0\3\76\2\0\13\76\7\0\3\76\14\0\6\76"+
    "\2\0\6\76\2\0\6\76\11\0\7\76\1\0\7\76\221\0\43\76"+
    "\15\0\12\77\6\0\u2ba4\76\14\0\27\76\4\0\61\76\u2104\0\u016e\76"+
    "\2\0\152\76\46\0\7\76\14\0\5\76\5\0\1\76\1\0\12\76"+
    "\1\0\15\76\1\0\5\76\1\0\1\76\1\0\2\76\1\0\2\76"+
    "\1\0\154\76\41\0\u016b\76\22\0\100\76\2\0\66\76\50\0\14\76"+
    "\164\0\5\76\1\0\207\76\23\0\12\77\7\0\32\76\6\0\32\76"+
    "\13\0\131\76\3\0\6\76\2\0\6\76\2\0\6\76\2\0\3\76"+
    "\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\16\0\1\1\1\2\1\1\1\3\6\4\1\5\14\4"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\2\1\1\30\2\4\1\31\1\32\1\33"+
    "\1\1\2\34\1\35\3\34\1\36\1\37\2\4\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\2\44\1\46\1\47"+
    "\1\50\4\4\1\51\16\4\1\52\1\53\2\4\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\3\4\1\0\1\62"+
    "\1\0\1\63\1\4\1\64\6\4\1\65\17\4\1\66"+
    "\1\67\1\70\1\71\5\4\1\72\7\4\1\73\11\4"+
    "\1\74\3\4\1\75\5\4\1\76\1\77\1\100\1\4"+
    "\1\101\1\102\1\4\1\103\2\4\1\104\5\4\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"+
    "\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380\0\u0380"+
    "\0\u03c0\0\u0400\0\u0440\0\u0480\0\u04c0\0\u0500\0\u0540\0\u0580"+
    "\0\u0380\0\u05c0\0\u0600\0\u0640\0\u0680\0\u06c0\0\u0700\0\u0740"+
    "\0\u0780\0\u07c0\0\u0800\0\u0840\0\u0880\0\u0380\0\u0380\0\u08c0"+
    "\0\u0900\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380\0\u0940\0\u0980"+
    "\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380\0\u09c0"+
    "\0\u0a00\0\u0a40\0\u0a80\0\u0ac0\0\u0b00\0\u0b40\0\u0380\0\u0b80"+
    "\0\u0380\0\u0400\0\u0380\0\u0bc0\0\u0c00\0\u0c40\0\u0380\0\u0380"+
    "\0\u0c80\0\u0cc0\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380\0\u0380"+
    "\0\u0d00\0\u0400\0\u0380\0\u0380\0\u0380\0\u0d40\0\u0d80\0\u0dc0"+
    "\0\u0e00\0\u04c0\0\u0e40\0\u0e80\0\u0ec0\0\u0f00\0\u0f40\0\u0f80"+
    "\0\u0fc0\0\u1000\0\u1040\0\u1080\0\u10c0\0\u1100\0\u1140\0\u1180"+
    "\0\u04c0\0\u11c0\0\u1200\0\u1240\0\u0380\0\u0380\0\u0380\0\u0380"+
    "\0\u0380\0\u0380\0\u1280\0\u12c0\0\u1300\0\u1340\0\u0380\0\u1380"+
    "\0\u0380\0\u13c0\0\u0380\0\u1400\0\u1440\0\u1480\0\u14c0\0\u1500"+
    "\0\u1540\0\u04c0\0\u1580\0\u15c0\0\u1600\0\u1640\0\u1680\0\u16c0"+
    "\0\u1700\0\u1740\0\u1780\0\u17c0\0\u1800\0\u1840\0\u1880\0\u18c0"+
    "\0\u1900\0\u0380\0\u04c0\0\u04c0\0\u04c0\0\u1940\0\u1980\0\u19c0"+
    "\0\u1a00\0\u1a40\0\u04c0\0\u1a80\0\u1ac0\0\u1b00\0\u1b40\0\u1b80"+
    "\0\u1bc0\0\u1c00\0\u04c0\0\u1c40\0\u1c80\0\u1cc0\0\u1d00\0\u1d40"+
    "\0\u1d80\0\u1dc0\0\u1e00\0\u1e40\0\u04c0\0\u1e80\0\u1ec0\0\u1f00"+
    "\0\u04c0\0\u1f40\0\u1f80\0\u1fc0\0\u2000\0\u2040\0\u04c0\0\u04c0"+
    "\0\u04c0\0\u2080\0\u04c0\0\u04c0\0\u20c0\0\u04c0\0\u2100\0\u2140"+
    "\0\u04c0\0\u2180\0\u21c0\0\u2200\0\u2240\0\u2280\0\u04c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\17\2\20\1\21\1\22\1\23\1\24\2\25\1\26"+
    "\1\27\1\25\1\30\1\31\2\22\1\32\1\25\1\33"+
    "\1\34\1\35\2\25\1\36\1\37\1\40\1\25\1\41"+
    "\1\42\1\43\1\44\1\45\1\25\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\1\17\1\62\1\63\1\64\1\65\1\66\1\17"+
    "\1\67\1\70\1\71\1\72\1\73\1\74\3\25\1\17"+
    "\1\25\5\17\1\22\10\75\1\17\2\22\21\75\27\17"+
    "\5\75\1\17\1\75\5\17\1\22\10\76\1\17\2\22"+
    "\21\76\27\17\5\76\1\17\1\76\5\17\1\22\11\17"+
    "\2\22\21\17\1\77\1\17\1\100\34\17\4\101\1\22"+
    "\11\101\2\102\22\101\1\103\20\101\1\104\20\101\1\22"+
    "\11\101\2\102\24\101\1\105\16\101\1\106\14\101\1\17"+
    "\1\107\1\110\1\21\1\22\1\111\3\25\1\26\2\25"+
    "\1\112\1\31\2\22\1\32\1\25\1\33\1\25\1\35"+
    "\3\25\1\37\2\25\1\41\1\42\1\43\1\25\1\45"+
    "\1\25\1\46\1\113\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\17\1\62\1\63"+
    "\1\64\1\65\1\66\1\17\1\67\1\70\1\71\1\17"+
    "\5\25\1\17\1\25\2\17\1\114\1\115\1\21\1\22"+
    "\1\111\3\25\1\26\2\25\1\112\1\31\2\22\1\32"+
    "\1\25\1\33\1\25\1\35\3\25\1\37\2\25\1\41"+
    "\1\42\1\43\1\25\1\45\1\25\1\46\1\116\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\1\17\1\62\1\63\1\64\1\65\1\66\1\17"+
    "\1\67\1\70\1\71\1\17\5\25\1\17\1\25\1\17"+
    "\1\117\1\120\1\117\1\121\1\122\11\117\2\122\62\117"+
    "\1\120\1\121\1\122\11\117\2\122\61\117\1\123\1\117"+
    "\1\121\1\122\11\117\2\122\62\117\1\123\1\121\1\122"+
    "\11\117\2\122\61\117\1\124\1\117\1\121\1\122\11\117"+
    "\2\122\62\117\1\124\1\121\1\122\11\117\2\122\60\117"+
    "\155\0\1\125\26\0\1\22\11\0\2\22\65\0\1\25"+
    "\1\126\3\25\1\127\3\25\2\0\21\25\27\0\10\25"+
    "\5\0\2\25\1\130\6\25\2\0\21\25\27\0\10\25"+
    "\5\0\11\25\2\0\21\25\27\0\10\25\5\0\5\25"+
    "\1\131\3\25\2\0\21\25\27\0\10\25\5\0\7\25"+
    "\1\132\1\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\7\25\1\133\11\25\27\0\10\25\5\0\1\25"+
    "\1\134\7\25\2\0\21\25\27\0\10\25\5\0\5\25"+
    "\1\135\3\25\2\0\21\25\27\0\10\25\5\0\5\25"+
    "\1\136\3\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\5\25\1\137\13\25\27\0\10\25\5\0\5\25"+
    "\1\140\3\25\2\0\11\25\1\141\7\25\27\0\10\25"+
    "\5\0\11\25\2\0\11\25\1\142\7\25\27\0\10\25"+
    "\5\0\2\25\1\143\6\25\2\0\5\25\1\144\13\25"+
    "\27\0\10\25\5\0\11\25\2\0\12\25\1\145\6\25"+
    "\27\0\10\25\5\0\6\25\1\146\2\25\2\0\16\25"+
    "\1\147\2\25\27\0\10\25\5\0\1\25\1\150\7\25"+
    "\2\0\21\25\27\0\10\25\5\0\4\25\1\151\4\25"+
    "\2\0\12\25\1\152\6\25\27\0\1\153\7\25\5\0"+
    "\1\154\10\25\2\0\21\25\27\0\10\25\52\0\1\155"+
    "\77\0\1\156\77\0\1\157\77\0\1\160\112\0\1\161"+
    "\100\0\1\162\11\0\4\72\1\0\11\72\1\0\61\72"+
    "\5\0\3\25\1\163\5\25\2\0\21\25\27\0\10\25"+
    "\5\0\11\25\2\0\11\25\1\164\7\25\27\0\3\25"+
    "\1\165\4\25\5\0\11\75\2\0\21\75\27\0\10\75"+
    "\5\0\11\76\2\0\21\76\27\0\10\76\43\0\1\166"+
    "\75\0\1\167\102\0\1\170\74\0\1\171\43\0\1\25"+
    "\1\126\7\25\2\0\21\25\27\0\10\25\5\0\3\25"+
    "\1\172\5\25\2\0\21\25\27\0\10\25\4\173\1\0"+
    "\73\173\5\0\2\25\1\174\6\25\2\0\21\25\27\0"+
    "\10\25\5\0\7\25\1\175\1\25\2\0\21\25\27\0"+
    "\10\25\5\0\11\25\2\0\12\25\1\176\6\25\27\0"+
    "\10\25\5\0\6\25\1\177\2\25\2\0\21\25\27\0"+
    "\10\25\5\0\5\25\1\200\3\25\2\0\21\25\27\0"+
    "\10\25\5\0\1\25\1\201\7\25\2\0\21\25\27\0"+
    "\10\25\5\0\11\25\2\0\3\25\1\202\15\25\27\0"+
    "\10\25\5\0\1\25\1\203\7\25\2\0\21\25\27\0"+
    "\10\25\5\0\11\25\2\0\6\25\1\204\12\25\27\0"+
    "\10\25\5\0\6\25\1\205\2\25\2\0\21\25\27\0"+
    "\10\25\5\0\11\25\2\0\21\25\27\0\1\206\7\25"+
    "\5\0\11\25\2\0\11\25\1\207\7\25\27\0\10\25"+
    "\5\0\1\210\10\25\2\0\21\25\27\0\10\25\5\0"+
    "\11\25\2\0\6\25\1\211\12\25\27\0\10\25\5\0"+
    "\1\202\10\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\11\25\1\212\7\25\27\0\10\25\5\0\6\25"+
    "\1\213\2\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\16\25\1\202\2\25\27\0\10\25\5\0\11\25"+
    "\2\0\3\25\1\214\15\25\27\0\10\25\5\0\11\25"+
    "\2\0\3\25\1\215\15\25\27\0\10\25\5\0\1\25"+
    "\1\216\7\25\2\0\21\25\27\0\10\25\5\0\1\217"+
    "\10\25\2\0\21\25\27\0\10\25\5\0\1\25\1\220"+
    "\7\25\2\0\21\25\27\0\10\25\5\0\11\25\2\0"+
    "\16\25\1\221\2\25\27\0\10\25\43\0\1\222\100\0"+
    "\1\103\40\0\11\25\2\0\3\25\1\223\15\25\27\0"+
    "\10\25\5\0\3\25\1\224\5\25\2\0\21\25\27\0"+
    "\10\25\5\0\11\25\2\0\21\25\27\0\2\25\1\225"+
    "\5\25\5\0\1\226\10\25\2\0\21\25\27\0\10\25"+
    "\5\0\7\25\1\174\1\25\2\0\21\25\27\0\10\25"+
    "\5\0\1\227\10\25\2\0\21\25\27\0\10\25\5\0"+
    "\5\25\1\230\3\25\2\0\21\25\27\0\10\25\5\0"+
    "\5\25\1\231\3\25\2\0\21\25\27\0\10\25\5\0"+
    "\3\25\1\232\5\25\2\0\21\25\27\0\10\25\5\0"+
    "\6\25\1\233\2\25\2\0\21\25\27\0\10\25\5\0"+
    "\11\25\2\0\21\25\27\0\1\234\7\25\5\0\6\25"+
    "\1\235\2\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\3\25\1\236\15\25\27\0\10\25\5\0\3\25"+
    "\1\237\5\25\2\0\21\25\27\0\10\25\5\0\5\25"+
    "\1\145\3\25\2\0\21\25\27\0\10\25\5\0\3\25"+
    "\1\202\5\25\2\0\21\25\27\0\10\25\5\0\2\25"+
    "\1\240\6\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\11\25\1\241\7\25\27\0\10\25\5\0\11\25"+
    "\2\0\16\25\1\242\2\25\27\0\10\25\5\0\5\25"+
    "\1\243\3\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\21\25\27\0\2\25\1\244\5\25\5\0\6\25"+
    "\1\245\2\25\2\0\21\25\27\0\10\25\5\0\11\25"+
    "\2\0\16\25\1\246\2\25\27\0\10\25\5\0\1\247"+
    "\10\25\2\0\21\25\27\0\10\25\5\0\11\25\2\0"+
    "\1\25\1\202\17\25\27\0\10\25\5\0\11\25\2\0"+
    "\21\25\27\0\1\250\7\25\5\0\11\25\2\0\7\25"+
    "\1\145\11\25\27\0\10\25\5\0\5\25\1\251\3\25"+
    "\2\0\21\25\27\0\10\25\5\0\3\25\1\252\5\25"+
    "\2\0\21\25\27\0\10\25\5\0\2\25\1\253\6\25"+
    "\2\0\21\25\27\0\10\25\5\0\11\25\2\0\7\25"+
    "\1\254\11\25\27\0\10\25\5\0\1\255\10\25\2\0"+
    "\21\25\27\0\10\25\5\0\1\25\1\256\7\25\2\0"+
    "\21\25\27\0\10\25\5\0\11\25\2\0\12\25\1\257"+
    "\6\25\27\0\10\25\5\0\4\25\1\260\4\25\2\0"+
    "\21\25\27\0\10\25\5\0\3\25\1\261\5\25\2\0"+
    "\21\25\27\0\10\25\5\0\11\25\2\0\21\25\27\0"+
    "\1\262\7\25\5\0\3\25\1\263\5\25\2\0\21\25"+
    "\27\0\10\25\5\0\3\25\1\264\5\25\2\0\21\25"+
    "\27\0\10\25\5\0\11\25\2\0\12\25\1\265\6\25"+
    "\27\0\10\25\5\0\5\25\1\266\3\25\2\0\21\25"+
    "\27\0\10\25\5\0\1\267\10\25\2\0\21\25\27\0"+
    "\10\25\5\0\1\270\10\25\2\0\21\25\27\0\10\25"+
    "\5\0\1\271\10\25\2\0\21\25\27\0\10\25\5\0"+
    "\11\25\2\0\20\25\1\202\27\0\10\25\5\0\6\25"+
    "\1\272\2\25\2\0\21\25\27\0\10\25\5\0\3\25"+
    "\1\273\5\25\2\0\21\25\27\0\10\25\5\0\1\25"+
    "\1\274\7\25\2\0\21\25\27\0\10\25\5\0\1\275"+
    "\10\25\2\0\21\25\27\0\10\25\5\0\11\25\2\0"+
    "\21\25\27\0\4\25\1\276\3\25\5\0\11\25\2\0"+
    "\12\25\1\202\6\25\27\0\10\25\5\0\11\25\2\0"+
    "\11\25\1\277\7\25\27\0\10\25\5\0\3\25\1\300"+
    "\5\25\2\0\21\25\27\0\10\25\5\0\11\25\2\0"+
    "\21\25\27\0\1\25\1\301\6\25\5\0\1\25\1\302"+
    "\7\25\2\0\21\25\27\0\10\25\5\0\11\25\2\0"+
    "\21\25\27\0\5\25\1\303\2\25\5\0\11\25\2\0"+
    "\21\25\27\0\1\304\7\25\5\0\3\25\1\305\5\25"+
    "\2\0\21\25\27\0\10\25\5\0\1\306\10\25\2\0"+
    "\21\25\27\0\10\25\5\0\5\25\1\307\3\25\2\0"+
    "\21\25\27\0\10\25";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8896];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\16\0\2\11\10\1\1\11\14\1\2\11\2\1\5\11"+
    "\2\1\7\11\7\1\1\11\1\1\1\11\1\1\1\11"+
    "\3\1\2\11\2\1\6\11\2\1\3\11\27\1\6\11"+
    "\3\1\1\0\1\11\1\0\1\11\1\1\1\11\26\1"+
    "\1\11\65\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  WdlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1762) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 51: 
          { yybegin(COMMAND2_VAR); return WdlTypes.COMMAND_VAR_OPENER;
          }
        case 70: break;
        case 63: 
          { return WdlTypes.OBJECT;
          }
        case 71: break;
        case 66: 
          { return WdlTypes.SCATTER;
          }
        case 72: break;
        case 41: 
          { return WdlTypes.AS;
          }
        case 73: break;
        case 24: 
          { return WdlTypes.COMMENT;
          }
        case 74: break;
        case 39: 
          { yybegin(COMMAND2_VAR); return WdlTypes.QUOTE;
          }
        case 75: break;
        case 7: 
          { return WdlTypes.RBRACE;
          }
        case 76: break;
        case 30: 
          { yybegin(COMMAND1_VAR_D_QUOTE); return WdlTypes.QUOTE;
          }
        case 77: break;
        case 26: 
          { yybegin(YYINITIAL); return WdlTypes.TASK_IDENTIFIER_DECL;
          }
        case 78: break;
        case 8: 
          { return WdlTypes.LESS_THAN;
          }
        case 79: break;
        case 6: 
          { return WdlTypes.LBRACE;
          }
        case 80: break;
        case 57: 
          { yybegin(WAITING_TASK_IDENTIFIER_DECL); return WdlTypes.TASK;
          }
        case 81: break;
        case 58: 
          { return WdlTypes.CALL;
          }
        case 82: break;
        case 52: 
          { return WdlTypes.ESCAPE_SEQUENCE;
          }
        case 83: break;
        case 40: 
          { return WdlTypes.QMARK;
          }
        case 84: break;
        case 23: 
          { return WdlTypes.COMMA;
          }
        case 85: break;
        case 34: 
          { yybegin(COMMAND2_VAR_S_QUOTE); return WdlTypes.QUOTE;
          }
        case 86: break;
        case 53: 
          { return WdlTypes.TYPE;
          }
        case 87: break;
        case 35: 
          { yybegin(COMMAND2); return WdlTypes.RBRACE;
          }
        case 88: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 89: break;
        case 27: 
          { yybegin(COMMAND1); return WdlTypes.COMMAND_DELIMITER_OPEN;
          }
        case 90: break;
        case 5: 
          { return WdlTypes.NUMBER;
          }
        case 91: break;
        case 38: 
          { yybegin(COMMAND1_VAR); return WdlTypes.QUOTE;
          }
        case 92: break;
        case 14: 
          { return WdlTypes.COLON;
          }
        case 93: break;
        case 47: 
          { return WdlTypes.NOT_EQUAL;
          }
        case 94: break;
        case 17: 
          { return WdlTypes.DOT;
          }
        case 95: break;
        case 21: 
          { return WdlTypes.SLASH;
          }
        case 96: break;
        case 67: 
          { yybegin(WAITING_COMMAND); return WdlTypes.COMMAND;
          }
        case 97: break;
        case 19: 
          { return WdlTypes.DASH;
          }
        case 98: break;
        case 46: 
          { return WdlTypes.DOUBLE_EQUAL;
          }
        case 99: break;
        case 22: 
          { return WdlTypes.PERCENT;
          }
        case 100: break;
        case 28: 
          { return WdlTypes.COMMAND_CHAR;
          }
        case 101: break;
        case 69: 
          { return WdlTypes.PARAMETER_META;
          }
        case 102: break;
        case 42: 
          { return WdlTypes.IF;
          }
        case 103: break;
        case 64: 
          { return WdlTypes.IMPORT;
          }
        case 104: break;
        case 12: 
          { return WdlTypes.LSQUARE;
          }
        case 105: break;
        case 9: 
          { return WdlTypes.MORE_THAN;
          }
        case 106: break;
        case 29: 
          { yybegin(YYINITIAL); return WdlTypes.COMMAND_DELIMITER_CLOSE;
          }
        case 107: break;
        case 65: 
          { return WdlTypes.RUNTIME;
          }
        case 108: break;
        case 50: 
          { yybegin(COMMAND1_VAR); return WdlTypes.COMMAND_VAR_OPENER;
          }
        case 109: break;
        case 62: 
          { return WdlTypes.OUTPUT;
          }
        case 110: break;
        case 61: 
          { return WdlTypes.WHILE;
          }
        case 111: break;
        case 2: 
          { yybegin(D_QUOTE); return WdlTypes.QUOTE;
          }
        case 112: break;
        case 33: 
          { yybegin(COMMAND2_VAR_D_QUOTE); return WdlTypes.QUOTE;
          }
        case 113: break;
        case 60: 
          { return WdlTypes.INPUT;
          }
        case 114: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 115: break;
        case 4: 
          { return WdlTypes.IDENTIFIER;
          }
        case 116: break;
        case 48: 
          { return WdlTypes.DOUBLE_PIPE;
          }
        case 117: break;
        case 31: 
          { yybegin(COMMAND1_VAR_S_QUOTE); return WdlTypes.QUOTE;
          }
        case 118: break;
        case 59: 
          { return WdlTypes.META;
          }
        case 119: break;
        case 15: 
          { return WdlTypes.EQUAL;
          }
        case 120: break;
        case 16: 
          { return WdlTypes.LOGICAL_NOT;
          }
        case 121: break;
        case 54: 
          { yybegin(COMMAND2); return WdlTypes.COMMAND_DELIMITER_OPEN;
          }
        case 122: break;
        case 49: 
          { return WdlTypes.DOUBLE_AMPERSAND;
          }
        case 123: break;
        case 56: 
          { return WdlTypes.BOOLEAN;
          }
        case 124: break;
        case 18: 
          { return WdlTypes.PLUS;
          }
        case 125: break;
        case 20: 
          { return WdlTypes.ASTERISK;
          }
        case 126: break;
        case 43: 
          { return WdlTypes.IN;
          }
        case 127: break;
        case 10: 
          { return WdlTypes.LPAREN;
          }
        case 128: break;
        case 45: 
          { return WdlTypes.MORE_EQUAL;
          }
        case 129: break;
        case 44: 
          { return WdlTypes.LESS_EQUAL;
          }
        case 130: break;
        case 11: 
          { return WdlTypes.RPAREN;
          }
        case 131: break;
        case 68: 
          { yybegin(WAITING_WORKFLOW_IDENTIFIER_DECL); return WdlTypes.WORKFLOW;
          }
        case 132: break;
        case 25: 
          { yybegin(YYINITIAL); return WdlTypes.WORKFLOW_IDENTIFIER_DECL;
          }
        case 133: break;
        case 37: 
          { yybegin(YYINITIAL); return WdlTypes.QUOTE;
          }
        case 134: break;
        case 36: 
          { return WdlTypes.QUOTE_STRING_CHAR;
          }
        case 135: break;
        case 55: 
          { return WdlTypes.SEP;
          }
        case 136: break;
        case 13: 
          { return WdlTypes.RSQUARE;
          }
        case 137: break;
        case 32: 
          { yybegin(COMMAND1); return WdlTypes.RBRACE;
          }
        case 138: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
