import React, {Component} from 'react'
import StudentService from '../services/StudentService';

class ListStudentComponent extends Component{

    constructor(props){
        super(props)
        this.state={
            student: []


        }
    }


    componentDidMount(){
        StudentService.getStudent().then((res) => {
            this.setState({student: res.data});

        });
    }


    render(){
        return(
            <div>
                <h2 className="text-center">Ogrenci Listesi</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                
                                <th>Adi</th>
                                <th>Soyadi</th>
                                <th>Bolumu</th>
                                <th>Kayit Tarihi</th>
                                <th>Islemler</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.student.map(
                                    student =>
                                    <tr key={student.studentid}>
                                        <td>{student.studentName}</td>
                                        <td>{student.studentSurName}</td>
                                        <td>{student.studentDepartment}</td>
                                        <td>{student.creationDate}</td>

                                    </tr>
                                )



                            }


                        </tbody>



                    </table>

                </div>


            </div>


        )
    }
}

export default ListStudentComponent
