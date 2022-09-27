#��������, ť ���� -> 1. ����ü�� �����Ҷ� �����ͺ��� �迭�� �����, 2. init�Լ����� 1ĭ¥�� �迭�� malloc�Ѵ�, 3. push�ߴµ� is_full�� 1�̸� realloc���� Ȯ���Ѵ�, 4. capacity�� �� �ʿ��ϴ� '���� ĭ����'
#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

typedef int element;
typedef struct stack{
	element *data;
	int top;
	int capacity;
}Stack;

void init(Stack *s){
	
	s->top = -1;
	s->capacity = 1;
	s->data = (element*)malloc(s->capacity*sizeof(element));
}

int is_empty(Stack *s){
	return s->top == -1;
}
int is_full(Stack* s){
	return s->capacity == s->top-1;
}

void push(Stack *s, int item){
	
	if(is_full(s)){
		s->capacity*=2;
		s->data = (element*)realloc(s->data, s->capacity*sizeof(element));
	}
	s->data[++(s->top)] = item;
}

element pop(Stack *s){
	
	if(is_empty(s)){
		fprintf(stderr, "���� ���� ����\n");
		exit(1);
	}	
	else return s->data[(s->top)--];
}

int main(void){
	
	Stack s;
	init(&s);
	push(&s, 1);
	push(&s, 2);
	push(&s, 3);
	
	printf("%d\n",pop(&s));
	printf("%d\n",pop(&s));
	printf("%d\n",pop(&s));
	
	free(&s);
}
