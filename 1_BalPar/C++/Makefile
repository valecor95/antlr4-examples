
JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=BalPar.g4
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
	$(CC) $(CCARGS) $(GENERATED)/BalParBaseListener.cpp -o $(OUTPUT)/BalParBaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/BalParLexer.cpp -o $(OUTPUT)/BalParLexer.o 
	$(CC) $(CCARGS) $(GENERATED)/BalParListener.cpp -o $(OUTPUT)/BalParListener.o 
	$(CC) $(CCARGS) $(GENERATED)/BalParParser.cpp -o $(OUTPUT)/BalParParser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/BalParBaseListener.o $(OUTPUT)/BalParLexer.o $(OUTPUT)/BalParListener.o $(OUTPUT)/BalParParser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
