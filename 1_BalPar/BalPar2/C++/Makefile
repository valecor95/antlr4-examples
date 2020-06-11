
JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=BalPar2.g4
ANTLR4=../../antlr-4.8-complete.jar

# here is where you plug in the runtime for your OS
RUNTIME=runtime-osx
CC=g++
CCARGS=-c -I $(RUNTIME)/antlr4-runtime/ -I $(GENERATED) -std=c++11	
LDARGS=-g
LIBS=$(RUNTIME)/lib/libantlr4-runtime.a

all: main

main: dirs antlr4 main.cpp
	$(CC) $(CCARGS) main.cpp  -o $(OUTPUT)/main.o 
	$(CC) $(CCARGS) $(GENERATED)/BalPar2BaseListener.cpp -o $(OUTPUT)/BalPar2BaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/BalPar2Lexer.cpp -o $(OUTPUT)/BalPar2Lexer.o 
	$(CC) $(CCARGS) $(GENERATED)/BalPar2Listener.cpp -o $(OUTPUT)/BalPar2Listener.o 
	$(CC) $(CCARGS) $(GENERATED)/BalPar2Parser.cpp -o $(OUTPUT)/BalPar2Parser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/BalPar2BaseListener.o $(OUTPUT)/BalPar2Lexer.o $(OUTPUT)/BalPar2Listener.o $(OUTPUT)/BalPar2Parser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
