import axios from 'axios';

const STUDENT_API_BASE_URL = "http://localhost:3333/api/v1/students";

class StudentService{
    getStudent(){
        return axios.get(STUDENT_API_BASE_URL);
    }

}

export default new StudentService()