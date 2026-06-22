import subprocess

# Función auxiliar para preparar cada prueba y comparar la salida.
def prepare_and_assert(input_array, output_array):
    expected_output = '\n'.join(output_array)
    output_data = subprocess.run(['node', 'index.js'] + input_array, stdout=subprocess.PIPE)
    output_bytes = output_data.stdout.strip()
    output_string = output_bytes.decode("utf-8")
    assert expected_output in output_string

# Tarea 1: costCalculator
def test_task_1_cost_calculator():
    input_array = ['1', '124']
    output_array = ['128.24']
    prepare_and_assert(input_array, output_array)

# Tarea 2: FriendNames
def test_task_2_friend_names():
    input_array = ['2', 'Karim', 'Uli', 'Georgina']
    output_array = ["FriendNames { name1: 'Karim', name2: 'Uli', name3: 'Georgina' }"]
    prepare_and_assert(input_array, output_array)

# Tarea 3: ageCalculator
def test_task_3_age_calculator():
    input_array = ['3', '2001', '12', '25']
    output_array = ['Successful']
    prepare_and_assert(input_array, output_array)

# Tarea 4: FriendAge
def test_task_4_friend_age():
    input_array = ['4', 'Kimi', '1998', '11', '5']
    output_array = ['Successful']
    prepare_and_assert(input_array, output_array)

# Tarea 5: rubricPassFail - caso aprobado
def test_task_5_pass():
    input_array = ['5', '6']
    output_array = ['Pass']
    prepare_and_assert(input_array, output_array)

# Tarea 5: rubricPassFail - caso reprobado
def test_task_5_fail():
    input_array = ['5', '4']
    output_array = ['Fail']
    prepare_and_assert(input_array, output_array)

# Tarea 6: rubricExcellent - caso excelente
def test_task_6_excellent():
    input_array = ['6', '9']
    output_array = ['Excellent']
    prepare_and_assert(input_array, output_array)

# Tarea 6: rubricExcellent - caso aprobado, no excelente
def test_task_6_not_excellent():
    input_array = ['6', '8']
    output_array = ['Pass']
    prepare_and_assert(input_array, output_array)

# Tarea 7: rubricPerfect - caso perfecto
def test_task_7_perfect():
    input_array = ['7', '11']
    output_array = ['Perfect']
    prepare_and_assert(input_array, output_array)

# Tarea 7: rubricPerfect - caso no perfecto
def test_task_7_not_perfect():
    input_array = ['7', '5']
    output_array = ['Pass']
    prepare_and_assert(input_array, output_array)
