JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=Palindrome.g4
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
	$(CC) $(CCARGS) $(GENERATED)/PalindromeBaseListener.cpp -o $(OUTPUT)/PalindromeBaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/PalindromeLexer.cpp -o $(OUTPUT)/PalindromeLexer.o 
	$(CC) $(CCARGS) $(GENERATED)/PalindromeListener.cpp -o $(OUTPUT)/PalindromeListener.o 
	$(CC) $(CCARGS) $(GENERATED)/PalindromeParser.cpp -o $(OUTPUT)/PalindromeParser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/PalindromeBaseListener.o $(OUTPUT)/PalindromeLexer.o $(OUTPUT)/PalindromeListener.o $(OUTPUT)/PalindromeParser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
