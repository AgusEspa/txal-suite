def read_article(file_name):
    file = open(file_name, "r")
    file_data = file.readlines()
    article = file_data[0].split(". ")
    sentences = []

    for sentence in article:
        print(sentence)
        sentences.append(sentence.replace("[^a-zA-Z]", " ").split(" "))
    sentences.pop()

    return sentences
