def main():
    my_dictionary = {'Adam': 17, 'Ron': 18, 'Teresa': 19, 'Sara': 16, 'Lane': 17, 'Kris': 16, 'Jax': 19}
    print('\n' + str(my_dictionary))
    print('\nLane is ' + str(my_dictionary['Lane']) + ' years old.')
    my_dictionary['Teresa'] = 20
    print('\n' + str(my_dictionary))
    del my_dictionary['Teresa']
    print('\nRemoving Teresa...')
    print('\n' + str(my_dictionary))
    my_dictionary.clear()
    print('\n' + str(my_dictionary))
    my_dictionary['Jake'] = 18
    print('\n' + str(my_dictionary))


if __name__ == '__main__':
    main()
