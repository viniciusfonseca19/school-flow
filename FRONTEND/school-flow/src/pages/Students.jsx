import { useEffect, useState } from "react";
import { getStudents, deleteStudent } from "../services/studentService";
import Table from "../components/Table";

function Students() {

  const [students, setStudents] = useState([]);

  const loadStudents = async () => {

    const response = await getStudents();

    setStudents(response.data);

  };

  useEffect(() => {
    loadStudents();
  }, []);

  const handleDelete = async (id) => {

    await deleteStudent(id);

    loadStudents();

  };

  return (

    <div>

      <h1>Students</h1>

      <Table
        columns={["id", "name", "email"]}
        data={students}
        onDelete={handleDelete}
      />

    </div>

  );
}

export default Students;