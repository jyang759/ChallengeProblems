#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int value;
    struct Node* next;
} Node;

Node* createCircularList(int n) {
    Node *head = malloc(sizeof(Node)), *current;
    head->value = 1;
    current = head;

    for (int i = 2; i <= n; i++) {
        Node *newNode = malloc(sizeof(Node));
        newNode->value = i;
        current->next = newNode;
        current = newNode;
    }
    current->next = head; // Make it circular

    return head;
}

int josephus(int n, int k) {
    Node* head = createCircularList(n);

    Node* prev = head;
    while (prev->next != head) {
        prev = prev->next;
    }

    Node* current = head;
    while (current->next != current) {
        for (int i = 1; i < k; i++) {
            prev = current;
            current = current->next;
        }
        prev->next = current->next;
        free(current);
        current = prev->next;
    }

    int result = current->value;
    free(current);
    return result;
}

int main() {
    int N, K;

    printf("Enter the number of people in the circle: ");
    scanf("%d", &N);

    printf("\nEnter the step size: ");
    scanf("%d", &K);

    int lastPerson = josephus(N, K);
    printf("The last person remaining is at position: %d\n", lastPerson);

    return 0;
}
