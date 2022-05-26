import os


def read_article(file_name):
    file = open('./text.txt')
    filedata = file.readlines()
    article = filedata[0].split(". ")
    sentences = []

    for sentence in article:
        sentences.append(sentence.replace("[^a-zA-Z]", " ").split(" "))
        sentences.pop()

    return sentences
