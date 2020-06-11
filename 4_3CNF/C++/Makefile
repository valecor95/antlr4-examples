JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=CNF3.g4
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
	$(CC) $(CCARGS) $(GENERATED)/CNF3BaseListener.cpp -o $(OUTPUT)/CNF3BaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/CNF3Lexer.cpp -o $(OUTPUT)/CNF3Lexer.o 
	$(CC) $(CCARGS) $(GENERATED)/CNF3Listener.cpp -o $(OUTPUT)/CNF3Listener.o 
	$(CC) $(CCARGS) $(GENERATED)/CNF3Parser.cpp -o $(OUTPUT)/CNF3Parser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/CNF3BaseListener.o $(OUTPUT)/CNF3Lexer.o $(OUTPUT)/CNF3Listener.o $(OUTPUT)/CNF3Parser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
