# ANTLR 
ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or translating structured text or binary files. It's widely used to build languages, tools, and frameworks. From a grammar, ANTLR generates a parser that can build and walk parse trees.
* [ANTLR - Official Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)

---
## Setup
* Download the file from the official page:
    * Linux: `wget https://www.antlr.org/download/antlr-4.8-complete.jar`
    * macOS: `sudo curl -O https://www.antlr.org/download/antlr-4.8-complete.jar`

* Copy the file downloaded to /usr/local/lib:
```
sudo cp antlr-4.8-complete.jar /usr/local/lib/
```

* Add antlr tool in your CLASSPATH
```
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
```

* Add aliases to simplify the use of ANTLR:
```
alias antlr4="java -jar /usr/local/lib/antlr-4.8-complete.jar"
alias grun="java org.antlr.v4.gui.TestRig"
```

---
## Java
Let's suppose that your grammar is named, as above, "MyGrammar"
**1.** Generare Lexer e Parser in base alla grammatica in ingresso:
```
antlr4 MyGrammar.g4
```

* `MyGrammarLexer.java`: analizzatore lessicale (lexer)
* `MyGrammarParser.java`: analizzatore sintattico (parser)
* `MyGrammarListener.java`, `MyGrammarBaseListener.java`: interfacce relative ai metodi del parser 
* `MyGrammar.interp`, `MyGrammar.tokens`, `MyGrammarLexer.interp`, `MyGrammarLexer.tokens`: necessari ad antlr per riconoscere token e regole di parsing

**2.** Compilare i file generati sopra
```
javac MyGrammar*.java
```

**3.** Usare il tool di Antlr ```TestRig``` (che noi abbiamo messo in alias come ```grun```)
```
grun MyGrammar <start-rule> <input-file>  -[options]
```

---
## C++ (TODO)
**1.** Generate Lexer and Parser from the input grammar:
```
antlr4 -Dlanguage=Cpp MyGrammar.g4
```

---
## Python

**1.** Generate Lexer and Parser from the input grammar:
```
antlr4 -Dlanguage=Python3 MyGrammar.g4
```

**2.** Once you've generated the lexer and/or parser code, you need to install the runtime:
```
pip3 install antlr4-python3-runtime
```
The Python runtimes are available from PyPI:

* https://pypi.python.org/pypi/antlr4-python3-runtime/

**3.** Let's suppose that your grammar is named, as above, "MyGrammar". Let's suppose this parser comprises a rule named "startRule" a fully functioning script might look like the following:

```python
import sys
from antlr4 import *
from MyGrammarLexer import MyGrammarLexer
from MyGrammarParser import MyGrammarParser

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = MyGrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MyGrammarParser(stream)
    tree = parser.startRule()

    if(parser.getNumberOfSyntaxErrors() == 0): 
        print("SUCCESS: input string is parsed correctly")

if __name__ == '__main__':
    main(sys.argv)
```

**4.** Run the script:
```
python3 script.py input-file
```

---
## JavaScript
**1.** Generate Lexer and Parser from the input grammar:
```
antlr4 -Dlanguage=JavaScript MyGrammar.g4
```

**2.** Once you've generated the lexer and/or parser code, you need to install the runtime:
```
npm install antlr4
```
The Python runtimes are available from PyPI:

* https://www.npmjs.com/package/antlr4

**3.** Let's suppose that your grammar is named, as above, "MyGrammar". Let's suppose this parser comprises a rule named "startRule" a fully functioning script might look like the following:

```javascript
var antlr4 = require('antlr4');
var MyGrammarLexer = require('./MyGrammarLexer').MyGrammarLexer;
var MyGrammarParser = require('./MyGrammarParser').MyGrammarParser;
var MyGrammarListener = require('./MyGrammarListener').MyGrammarListener;

var input = "your text to parse here"
var chars = new antlr4.InputStream(input);
var lexer = new MyGrammarLexer(chars);
var tokens  = new antlr4.CommonTokenStream(lexer);
var parser = new MyGrammarParser(tokens);
parser.buildParseTrees = true;
var tree = parser.MyStartRule();
```

**4.** Run the script:
```
node script.js
```

---
## Useful links
* [ANTLR - Official Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)
* [ANTLR - Official page](https://www.antlr.org)
* [GitHub - antlr main repository](https://github.com/antlr/antlr4)
* [GitHub - Grammars for the main languages](https://github.com/antlr/grammars-v4)
* [The ANTLR Mega Tutorial](https://tomassetti.me/antlr-mega-tutorial/)
* [StackOverflow antlr tag](https://stackoverflow.com/questions/tagged/antlr)
