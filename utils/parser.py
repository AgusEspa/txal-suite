def read_article(file_name):

    with open(file_name, "r") as file:
        file_data = file.readlines()

    article = file_data[0].split(". ")
    sentences = []

    for sentence in article:
        print(sentence)
        sentences.append(sentence.replace("[^a-zA-Z]", " ").split(" "))
    sentences.pop()

    return sentences
