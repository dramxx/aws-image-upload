import React, {useCallback} from 'react';
import {useDropzone} from 'react-dropzone'

const DropZone = () => {

  const onDrop = useCallback(acceptedFiles => {
    //TODO: send files to server
    console.log("acceptedFiles: ", acceptedFiles)
  }, [])

  const {getRootProps, getInputProps, isDragActive = false} = useDropzone({
    onDrop,
    accept: 'image/jpeg, image/png',
  })

  return (
      <div {...getRootProps()} className="drop-zone">
        <input {...getInputProps()} />
        {
          isDragActive ?
              <p>Drop the files here ...</p> :
              <p>Drag 'n' drop some files here, or click to select files</p>
        }
      </div>
  )
}

export default DropZone
