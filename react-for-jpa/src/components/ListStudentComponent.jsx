import React, {Component} from 'react';

class ListStudentComponent extends Component{

    constructor(props){
        super(props)
        this.state={
            student: []


        }
    }


    render(){
        return(
            <div>
                <h2 className="text-center">Ogrenci Listesi</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Ogrenci Numarasi</th>
                                <th>Adi</th>
                                <th>Soyadi</th>
                                <th>Bolumu</th>
                                <th>Kayit Tarihi</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.student.map(
                                    student =>
                                    <tr key={student.id}>
                                        <td>{student.firstName}</td>
                                        <td>{student.surName}</td>
                                        <td>{student.department}</td>
                                        <td>{student.date}</td>

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
