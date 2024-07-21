

let students = [
    {
        name: "Ajay",
        age: 17,
        mark: "75%",
    },
    {
        name: "Veena",
        age: 17,
        mark: "86%",
    },
    {
        name: "Rahul",
        age: 17,
        mark: "92%",
    },
]


let outputTable = document.getElementById('table');

students.forEach(student=> {
    let tableRow = document.createElement('tr');
    tableRow.className = 'item';
    const listContent = `
    <td> ${student.name}</td>
    <td> ${student.age}</td>
    <td> ${student.mark}</td>
    `;

    console.log("Name :" + student.name);

    tableRow.innerHTML = listContent;

    console.log(tableRow);
    console.log(outputTable);

    outputTable.appendChild(tableRow);
});