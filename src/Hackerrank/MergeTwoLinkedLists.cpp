#include <bits/stdc++.h>

using namespace std;

class SinglyLinkedListNode {
    public:
        int data;
        SinglyLinkedListNode *next;

        SinglyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = nullptr;
        }
};

class SinglyLinkedList {
    public:
        SinglyLinkedListNode *head;
        SinglyLinkedListNode *tail;

        SinglyLinkedList() {
            this->head = nullptr;
            this->tail = nullptr;
        }

        void insert_node(int node_data) {
            SinglyLinkedListNode* node = new SinglyLinkedListNode(node_data);

            if (!this->head) {
                this->head = node;
            } else {
                this->tail->next = node;
            }

            this->tail = node;
        }
};

void print_singly_linked_list(SinglyLinkedListNode* node, string sep, ofstream& fout) {
    while (node) {
        fout << node->data;

        node = node->next;

        if (node) {
            fout << sep;
        }
    }
}

void free_singly_linked_list(SinglyLinkedListNode* node) {
    while (node) {
        SinglyLinkedListNode* temp = node;
        node = node->next;

        free(temp);
    }
}

// Complete the mergeLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    if(head1 == nullptr) return head2;
    if(head2 == nullptr) return head1;
    SinglyLinkedList *newHead = new SinglyLinkedList();
    SinglyLinkedListNode *tmp1 = head1, *tmp2 = head2;
    while(tmp1!=nullptr && tmp2!=nullptr){
        if(tmp1->data<tmp2->data){
            newHead->insert_node(tmp1->data);
            tmp1 = tmp1->next; 
        }else{
            newHead->insert_node(tmp2->data);
            tmp2 = tmp2->next;      
           
        }
    }
    while(tmp1!=nullptr){
        newHead->insert_node(tmp1->data);
        tmp1=tmp1->next;

    }
    while(tmp2!=nullptr){
        newHead->insert_node(tmp2->data);
        tmp2=tmp2->next;
    }
    return newHead->head;
}