JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=G1.g4
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
	$(CC) $(CCARGS) $(GENERATED)/G1BaseListener.cpp -o $(OUTPUT)/G1BaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/G1Lexer.cpp -o $(OUTPUT)/G1Lexer.o 
	$(CC) $(CCARGS) $(GENERATED)/G1Listener.cpp -o $(OUTPUT)/G1Listener.o 
	$(CC) $(CCARGS) $(GENERATED)/G1Parser.cpp -o $(OUTPUT)/G1Parser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/G1BaseListener.o $(OUTPUT)/G1Lexer.o $(OUTPUT)/G1Listener.o $(OUTPUT)/G1Parser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
