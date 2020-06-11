JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=MyGrammar.g4
ANTLR4=../../antlr-4.8-complete.jar

# here is where you plug in the runtime for your OS
RUNTIME=runtime-linux
CC=g++
CCARGS=-c -I $(RUNTIME)/antlr4-runtime/ -I $(GENERATED) -std=c++11	
LDARGS=-g
LIBS=$(RUNTIME)/lib/libantlr4-runtime.a

all: main

main: dirs antlr4 main.cpp
	$(CC) $(CCARGS) main.cpp  -o $(OUTPUT)/main.o 
	$(CC) $(CCARGS) $(GENERATED)/MyGrammarBaseListener.cpp -o $(OUTPUT)/MyGrammarBaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/MyGrammarLexer.cpp -o $(OUTPUT)/MyGrammarLexer.o 
	$(CC) $(CCARGS) $(GENERATED)/MyGrammarListener.cpp -o $(OUTPUT)/MyGrammarListener.o 
	$(CC) $(CCARGS) $(GENERATED)/MyGrammarParser.cpp -o $(OUTPUT)/MyGrammarParser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/MyGrammarBaseListener.o $(OUTPUT)/MyGrammarLexer.o $(OUTPUT)/MyGrammarListener.o $(OUTPUT)/MyGrammarParser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
