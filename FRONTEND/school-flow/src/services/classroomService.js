import api from "./api";

export const getClassrooms = () => api.get("/classrooms");

export const createClassroom = (data) =>
  api.post("/classrooms", data);

export const updateClassroom = (id, data) =>
  api.put(`/classrooms/${id}`, data);

export const deleteClassroom = (id) =>
  api.delete(`/classrooms/${id}`);